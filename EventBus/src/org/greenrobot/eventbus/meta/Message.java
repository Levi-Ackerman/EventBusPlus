package org.greenrobot.eventbus.meta;


public class Message {
    public int id;
    public Object event;

    public Message(int id, Object event) {
        this.id = id;
        this.event = event;
    }
}
