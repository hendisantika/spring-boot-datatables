package com.hendisantika.springbootdatatables;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatables
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/08/18
 * Time: 06.57
 * To change this template use File | Settings | File Templates.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "offices")
class Office {

    @Id
    @GeneratedValue
    private int id;
    private String city;

}