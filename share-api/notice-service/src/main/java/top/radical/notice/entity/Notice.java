package top.radical.notice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-06
 **/

@Data
@Entity
public class Notice implements Serializable {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否显示 0:否 1:是
     */
    private Boolean showFlag;

    /**
     * 创建时间
     */
    private Date createTime;
}
