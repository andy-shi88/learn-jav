import java.util.*;

class BaseResponse<T> {
	private String message;
	private Boolean success;
	private List<T> data;


	public BaseResponse() {
		this.message = "";
		this.success  = false;
	}

	public List<T> getData() {
		return this.data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean isSuccess() {
		return this.success;
	}

	
}