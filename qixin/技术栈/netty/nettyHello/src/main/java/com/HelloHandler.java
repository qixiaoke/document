package com;

import org.jboss.netty.channel.*;

/**
 * Created by qixin on 2018/1/11.
 */
public class HelloHandler extends SimpleChannelHandler {
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        System.out.println("messageReceived");
        /*
        ChannelBuffer message = (ChannelBuffer) e.getMessage();
        String s = new String(message.array());
        System.out.println(s);
        */
        // 写了pipeline.addLast("decoder", new StringDecoder()); 就不需要上面转buffer了
        String s = (String) e.getMessage();
        System.out.println(s);

        /*
        ChannelBuffer copiedBuffer = ChannelBuffers.copiedBuffer("hi".getBytes());
        ctx.getChannel().write(copiedBuffer);
        */
        // 写了pipeline.addLast("encoder", new StringEncoder()); 就不需要上面的buffer了
        ctx.getChannel().write("hi");

        super.messageReceived(ctx, e);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        System.out.println("exceptionCaught");
        super.exceptionCaught(ctx, e);
    }

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelConnected");
        super.channelConnected(ctx, e);
    }

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelDisconnected");
        super.channelDisconnected(ctx, e);
    }

    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelClosed");
        super.channelClosed(ctx, e);
    }
}
