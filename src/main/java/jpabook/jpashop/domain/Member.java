package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    //연관관계의 거울, mapped by = member 하면 order테이블에서의 member 필드위에 거울이 된다.
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
