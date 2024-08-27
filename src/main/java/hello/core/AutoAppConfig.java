package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",           // 해당 패키지부터 하위 패키지 컴포넌트 스캔
//        basePackageClasses = AutoAppConfig.class,     // 지정한 클래스의 패키지를 탐색 시작 위치로 지정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")      // 같은 이름으로 수동 스프링 빈 만들어서 테스트하기
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
