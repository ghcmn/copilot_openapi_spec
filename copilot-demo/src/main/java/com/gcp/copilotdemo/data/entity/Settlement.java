package com.gcp.copilotdemo.data.entity;

import com.gcp.copilotdemo.model.SettlementModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "settlements")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Settlement {
    @Id
    private String settlement_id;
    private String settlement_details;
    private String status;
    private String net_settlement_id;
    private String payment_id;
    private String cancellation_id;

    @Temporal(TemporalType.DATE)
    private Date created_date;

    @Temporal(TemporalType.DATE)
    private Date updated_date;
}
