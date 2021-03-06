package cn.biuaxia.code.sport.lexin.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author biuaxia
 * @date 2020-09-19 02:48:56
 */
@Data
@Builder
public class TimedTaskErrorLog {

    private Long id;
    private Long taskId;
    private String responseJson;

}
