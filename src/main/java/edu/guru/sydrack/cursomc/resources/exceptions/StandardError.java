package edu.guru.sydrack.cursomc.resources.exceptions;

public class StandardError {
    private Integer status;
    private String msg;
    private Long timeStamp;
    
    public StandardError(Integer status, String msg, Long timeStamp){
        super();
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }
    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * @return the timeStamp
     */
    public Long getTimeStamp() {
        return timeStamp;
    }
    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}