package hyt.rocketmq.base.producer;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

/**
 * @Author huyouting
 * @Date 2021/2/25 16:22
 * @Description:
 */

/**
 * 发送单向消息
 */
public class OnewayProducer {

    public static void main(String[] args) throws Exception {
        //1.创建消息生产者producer，并制定生产者组名
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        //2.指定Nameserver地址
        producer.setNamesrvAddr("47.102.157.248:9876");
        //3.启动producer
        producer.start();
        for (int i = 0; i < 10; i++) {
            //4.创建消息对象，指定主题Topic、Tag和消息体
            /**
             * 参数一：消息主图Topic
             * 参数二：消息Tag
             * 参数三：消息内容
             */
            Message message = new Message("base", "Tag3", ("hello world,单向消息" + i).getBytes());
            //5.发送消息
            producer.sendOneway(message);
            //线程睡一秒钟
            TimeUnit.SECONDS.sleep(1);
        }
        //6.关闭生产者producer
        producer.shutdown();
    }
}
