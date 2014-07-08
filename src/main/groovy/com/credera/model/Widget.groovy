package com.credera.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'WIDGET')
class Widget {
    @Id
    @GeneratedValue
    @Column(name = 'ID')
    Long id

    @Column(name = 'NAME')
    String name

    @Column(name = 'DESCRIPTION')
    String description
}
