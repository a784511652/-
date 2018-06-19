package com.imooc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @auther jiahaowei
 * @date： 2017/12/20 0020
 * @time： 13:10
 * @project_name： mc_springboot_dinner
 * @Description ：CopyOnWriteArrayList适合使用在读操作远远大于写操作的场景里，比如缓存。发生修改时候做copy，新老版本分离，保证读的高性能，适用于以读为主的情况。
 */
@Component
@ServerEndpoint("/webSocket")
@Slf4j
public class WebSocket {

    private Session session;

    private static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    @OnOpen
    public void opOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);
        log.info("【websocket消息】有新的连接，总数{}", webSocketSet.size());
    }

    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        log.info("【websocket消息】连接断开，总数{}", webSocketSet.size());
    }

    @OnMessage
    public void onMessage(String message){
        log.info("【websocket消息】收到客户端发来的消息:{}", message);
    }

    public void sendMessage(String message){
        for (WebSocket webSocket:webSocketSet){
            log.info("【websocket消息】广播消息，message{}", webSocketSet.size());
            try {
                webSocket.session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
