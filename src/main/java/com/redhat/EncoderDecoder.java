package com.redhat;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.CharsetUtil;

public class EncoderDecoder {

    public static class NettyEncoder extends MessageToByteEncoder<String> {

        @Override
        protected void encode(ChannelHandlerContext ctx, String msg, ByteBuf out)
                throws Exception {
            System.out.println("Encode: "+msg);
            out.writeBytes(msg.getBytes());
        }       
    }

    public static class NettyDecoder extends ByteToMessageDecoder{

        @Override
        protected void decode(ChannelHandlerContext ctx, ByteBuf in,
                List<Object> out) throws Exception {
            if((in.readableBytes() < 4) ) {
                return;
            }
            String msg = in.toString(CharsetUtil.UTF_8);
            System.out.println("Decode:"+msg);

            out.add(new String(msg));
        }

    }

}