package com.wan.reactor;

import com.sun.xml.internal.ws.util.StringUtils;
import io.netty.util.internal.StringUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author wan
 * @Description: 响应式编程
 * @date 2021/7/29 14:28
 */
public class TestReactor {
    public static void main(String[] args) {
//        String[] str = {"the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
//        Flux.fromArray(str).zipWith(Flux.range(0, Integer.MAX_VALUE), (word, index) ->
//                "index:"+index+"   "+word) // ③
//                .subscribe(System.out::println);


//        // 创建 Flux 响应流
//        Flux<String> source = Flux.just("foo", "bar");
//        // 使用 concatWith 操作符连接 2 个响应流
//        Flux<String> boom = source.concatWith(Mono.error(new IllegalArgumentException("boom")));
//        // 创建一个 StepVerifier 构造器来包装和校验一个 Flux。
//        StepVerifier.create(boom)
//                .expectNext("foo")          // 第一个我们期望的信号是 onNext，它的值为 foo
//                .expectNext("bar")          // 第二个我们期望的信号是 onNext，它的值为 bar
//                .expectErrorMessage("boom") // 最后我们期望的是一个终止信号 onError，异常内容应该为 boom
//                .verify();


        Flux.range(1, 10)
                .flatMap(n -> Mono.just(n + 100))
                .single()
                .map(n -> n * 2)
                .subscribe(System.out::println);

    }
}
