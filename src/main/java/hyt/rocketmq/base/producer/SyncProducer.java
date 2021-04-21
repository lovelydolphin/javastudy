package hyt.rocketmq.base.producer;

/**
 * @Author huyouting
 * @Date 2021/2/25 15:25
 * @Description:
 */

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.concurrent.TimeUnit;

/**
 * 发送同步消息
 */
public class SyncProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
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
            Message message  =new Message("base","Tag1",("hello world"+i).getBytes());
            //5.发送消息
            SendResult result = producer.send(message);
            //发送状态
            SendStatus sendStatus = result.getSendStatus();
            //消息id
            String msgId = result.getMsgId();
            //消息接收队列id
            int queueId = result.getMessageQueue().getQueueId();
            System.out.println("发送结果："+result);
            System.out.println("发送状态:"+sendStatus+"消息id:"+msgId+"消息接收队列id:"+queueId);
            //线程睡一秒钟
            TimeUnit.SECONDS.sleep(1);
        }
        //6.关闭生产者producer
        producer.shutdown();
    }
}
