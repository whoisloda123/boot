package com.liucan.boot.persist.mybatis.mode;

public class SystemLogWithBLOBs extends SystemLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.exception
     *
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    private String exception;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.body
     *
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    private String body;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.exception
     *
     * @return the value of system_log.exception
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    public String getException() {
        return exception;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.exception
     *
     * @param exception the value for system_log.exception
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.body
     *
     * @return the value of system_log.body
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.body
     *
     * @param body the value for system_log.body
     * @mbg.generated Sun Apr 19 15:14:22 CST 2020
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}