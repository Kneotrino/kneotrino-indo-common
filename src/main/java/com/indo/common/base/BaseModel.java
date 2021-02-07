package com.indo.common.base;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Base Model
 * this is simple standard for spring boot entity class
 *
 * @author  kneotrino
 * @version 1.0
 * @since   2021-1-1
 */

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    protected Long id;

    @Builder.Default
    protected Boolean enabled = Boolean.TRUE;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date DateCreated;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateModified;
}
