package hyt.designpattern.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huyouting
 * @Date 2021/2/21 15:32
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>,欢迎访问 hyt.com,大家都是996");
        //处理msg
//        List<Filter> filters = new ArrayList<>();
//        filters.add(new HtmlFilter());
//        filters.add(new HtmlFilter());
//
//        for (Filter filter : filters) {
//            filter.doFilter(msg);
//        }
//        new HtmlFilter().doFilter(msg);
//        new HtmlFilter().doFilter(msg);
        FilterChain fc = new FilterChain();
//        fc.add(new HtmlFilter()).add(new SensitiveFilter());
//        FilterChain fc2 = new FilterChain();
//        fc2.add(new FaceFilter()).add(new UrlFilter());
//        fc.add(fc2).doFilter(msg);
        fc.add(new HtmlFilter()).add(new SensitiveFilter()).add(new FaceFilter()).add(new UrlFilter()).doFilter(msg);
        System.out.println(msg.getMsg());
    }
}

class Msg {

    String name;
    String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}

interface Filter{

    boolean doFilter(Msg m);
}

class HtmlFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        m.setMsg(r);
        return true;
    }
}

class SensitiveFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r=r.replace("996","955");
        m.setMsg(r);
        return false;
    }
}

class FaceFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r=r.replace(":)","^_^");
        m.setMsg(r);
        return true;
    }
}

class UrlFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r=r.replace("hyt.com","www.hyt.com");
        m.setMsg(r);
        return true;
    }
}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg){
        for (Filter f : filters) {
            if(!f.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
