package vn.kase.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleError {
    private String code;
    private String message;
}
