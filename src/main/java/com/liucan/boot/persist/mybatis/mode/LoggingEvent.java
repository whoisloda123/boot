package com.liucan.boot.persist.mybatis.mode;

public class LoggingEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.timestmp
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private Long timestmp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.logger_name
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String loggerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.level_string
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String levelString;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.thread_name
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String threadName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.reference_flag
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private Short referenceFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.arg0
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String arg0;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.arg1
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String arg1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.arg2
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String arg2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.arg3
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String arg3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.caller_filename
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String callerFilename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.caller_class
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String callerClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.caller_method
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String callerMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.caller_line
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String callerLine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.event_id
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private Long eventId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logging_event.formatted_message
     *
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    private String formattedMessage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.timestmp
     *
     * @return the value of logging_event.timestmp
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public Long getTimestmp() {
        return timestmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.timestmp
     *
     * @param timestmp the value for logging_event.timestmp
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setTimestmp(Long timestmp) {
        this.timestmp = timestmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.logger_name
     *
     * @return the value of logging_event.logger_name
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getLoggerName() {
        return loggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.logger_name
     *
     * @param loggerName the value for logging_event.logger_name
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName == null ? null : loggerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.level_string
     *
     * @return the value of logging_event.level_string
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getLevelString() {
        return levelString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.level_string
     *
     * @param levelString the value for logging_event.level_string
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setLevelString(String levelString) {
        this.levelString = levelString == null ? null : levelString.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.thread_name
     *
     * @return the value of logging_event.thread_name
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.thread_name
     *
     * @param threadName the value for logging_event.thread_name
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setThreadName(String threadName) {
        this.threadName = threadName == null ? null : threadName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.reference_flag
     *
     * @return the value of logging_event.reference_flag
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public Short getReferenceFlag() {
        return referenceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.reference_flag
     *
     * @param referenceFlag the value for logging_event.reference_flag
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setReferenceFlag(Short referenceFlag) {
        this.referenceFlag = referenceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.arg0
     *
     * @return the value of logging_event.arg0
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.arg0
     *
     * @param arg0 the value for logging_event.arg0
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setArg0(String arg0) {
        this.arg0 = arg0 == null ? null : arg0.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.arg1
     *
     * @return the value of logging_event.arg1
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.arg1
     *
     * @param arg1 the value for logging_event.arg1
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setArg1(String arg1) {
        this.arg1 = arg1 == null ? null : arg1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.arg2
     *
     * @return the value of logging_event.arg2
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.arg2
     *
     * @param arg2 the value for logging_event.arg2
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setArg2(String arg2) {
        this.arg2 = arg2 == null ? null : arg2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.arg3
     *
     * @return the value of logging_event.arg3
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.arg3
     *
     * @param arg3 the value for logging_event.arg3
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setArg3(String arg3) {
        this.arg3 = arg3 == null ? null : arg3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.caller_filename
     *
     * @return the value of logging_event.caller_filename
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getCallerFilename() {
        return callerFilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.caller_filename
     *
     * @param callerFilename the value for logging_event.caller_filename
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setCallerFilename(String callerFilename) {
        this.callerFilename = callerFilename == null ? null : callerFilename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.caller_class
     *
     * @return the value of logging_event.caller_class
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getCallerClass() {
        return callerClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.caller_class
     *
     * @param callerClass the value for logging_event.caller_class
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setCallerClass(String callerClass) {
        this.callerClass = callerClass == null ? null : callerClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.caller_method
     *
     * @return the value of logging_event.caller_method
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getCallerMethod() {
        return callerMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.caller_method
     *
     * @param callerMethod the value for logging_event.caller_method
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setCallerMethod(String callerMethod) {
        this.callerMethod = callerMethod == null ? null : callerMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.caller_line
     *
     * @return the value of logging_event.caller_line
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getCallerLine() {
        return callerLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.caller_line
     *
     * @param callerLine the value for logging_event.caller_line
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setCallerLine(String callerLine) {
        this.callerLine = callerLine == null ? null : callerLine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.event_id
     *
     * @return the value of logging_event.event_id
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.event_id
     *
     * @param eventId the value for logging_event.event_id
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logging_event.formatted_message
     *
     * @return the value of logging_event.formatted_message
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public String getFormattedMessage() {
        return formattedMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logging_event.formatted_message
     *
     * @param formattedMessage the value for logging_event.formatted_message
     * @mbg.generated Sat Apr 25 11:46:27 CST 2020
     */
    public void setFormattedMessage(String formattedMessage) {
        this.formattedMessage = formattedMessage == null ? null : formattedMessage.trim();
    }
}