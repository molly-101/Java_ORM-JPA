package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;
    private String createDate;
    private LocalDateTime lastModifiedBy;
    private LocalDateTime timeStamp;
}
