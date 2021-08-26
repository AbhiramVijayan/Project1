package com.adfolks.project1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Setting;



@Document(indexName = "departmentid")
@Setting(settingPath = "static/es-settings.json")
// Removed Boilerplate code
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//----------

public class Department {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String departmentid;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;





}
