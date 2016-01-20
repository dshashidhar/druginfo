package com.deloitte.druginfo.model;

import java.util.Date;

public class DrugVO {
	
	    private long id;
	    
		private String name;
	     
	    private String price;
	     
	    private Date createdDate;
	    
	    private Date modifiedDate;
     
	   
		public DrugVO(long id, String name, String price, Date createdDate, Date modifiedDate) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.createdDate = createdDate;
			this.modifiedDate = modifiedDate;
		}
		
		

		public long getId() {
				return id;
			}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public Date getModifiedDate() {
			return modifiedDate;
		}

		public void setModifiedDate(Date modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

	

}
