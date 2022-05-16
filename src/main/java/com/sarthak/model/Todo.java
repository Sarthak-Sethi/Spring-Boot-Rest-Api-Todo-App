package com.sarthak.model;

import java.util.Date;

public class Todo {
	    private String id;
	    private String title;
	    private boolean isComplete;
	    private Date date;

		public Todo(String id, String title, boolean isComplete, Date date) {
			super();
			this.id = id;
			this.title = title;
			this.isComplete = isComplete;
			this.date = date;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public boolean isComplete() {
			return isComplete;
		}
		public void setComplete(boolean isComplete) {
			this.isComplete = isComplete;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
}
