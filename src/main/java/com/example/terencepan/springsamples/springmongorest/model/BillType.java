package com.example.terencepan.springsamples.springmongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "billtype")
public class BillType {
    @Id
    private String id;
    private String billingTypeCode;
    private String billingTypeDescription;
}
