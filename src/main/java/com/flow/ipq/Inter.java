package com.flow.ipq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@RequiredArgsConstructor
@Entity
@Table(name = "BATCH_CLAIM_INFO_INTER")
@Data
@AllArgsConstructor
public class Inter {
    @Id
    @Column(name = "claim_id")
    private Integer claimId;
    @Column(name = "name")
    private String name;
    @Column(name = "inter")
    private String inter;
    @Column(name = "status")
    private String status;

    // create table BATCH_CLAIM_INFO_INTER(claim_id int not null, name text not null, inter text not null, status text not null);
}
