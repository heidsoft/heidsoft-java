package com.heidsoft.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import static io.netty.util.CharsetUtil.UTF_8;

/**
 * Created by heidsoft on 2017/4/28.
 */
public class NettyClient {
    public static void main(String[] args){

        EventLoopGroup workerGroup = new NioEventLoopGroup(2);//1 is OK
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workerGroup)
                .channel(SocketChannel.class)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS,10000)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(10240, 0, 2, 0, 2))
                                .addLast(new StringDecoder(UTF_8))
                                .addLast(new LengthFieldPrepender(2))
                                .addLast(new StringEncoder(UTF_8));
                    }
                });
    }
}

class ChannelHandler extends ChannelHandlerAdapter{

}
