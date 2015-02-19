package org.nextrtc.examples.one_room.ui;

import javax.websocket.server.ServerEndpoint;

import org.nextrtc.server.NextRTCEndpoint;
import org.nextrtc.server.codec.MessageDecoder;
import org.nextrtc.server.codec.MessageEncoder;

@ServerEndpoint(value = "/signaling",//
decoders = MessageDecoder.class,//
encoders = MessageEncoder.class)
public class MyEndpoint extends NextRTCEndpoint {
}
