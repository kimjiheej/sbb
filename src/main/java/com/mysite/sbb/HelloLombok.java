package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter

@RequiredArgsConstructor
public class HelloLombok {

  private final String hello;
  private final int lombok;
    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());

        //즉 이미 생성자가 만들어졌기 때문에 의존성 주입으로 인해서 그냥 바로 가져다 쓸 수 있다.
    }
}