package dto;

public class Result {
    private boolean flag;
    private String status;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, String status, Object data) {
        this.flag = flag;
        this.status = status;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
