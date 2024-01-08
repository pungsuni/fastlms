package com.zerobase.fastlms.course.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public interface TakeCourseCode {

    String STATUS_REQ = "REQ"; // 수강신청
    String STATUS_COMPLIETE = "COMPLETE"; //결제완료
    String STATUS_CANCEL = "CANCEL"; //수강취소



}
