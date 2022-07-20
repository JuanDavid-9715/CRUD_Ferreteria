package modelo;

// @author Juan David Medellin Calderon
public class Store {
			private int id;
			private String name;
			private String category;
			private double purchaseValue;
			private double seleValue;
			private int quantity;
			
			public Store() {
						
			}
			
			public Store(int id, String name, String category, double purchaseV, double seleV, int quantuty) {
						super();
						this.id = id;
						this.name = name;
						this.category = category;
						this.purchaseValue  = purchaseV;
						this.seleValue = seleV;
						this.quantity = quantuty;
			}

			public int getId() {
						return id;
			}

			public void setId(int id) {
						this.id = id;
			}

			public String getName() {
						return name;
			}

			public void setName(String name) {
						this.name = name;
			}

			public String getCategory() {
						return category;
			}

			public void setCategory(String category) {
						this.category = category;
			}

			public double getPurchaseValue() {
						return purchaseValue;
			}

			public void setPurchaseValue(double purchaseValue) {
						this.purchaseValue = purchaseValue;
			}

			public double getSeleValue() {
						return seleValue;
			}

			public void setSeleValue(double seleValue) {
						this.seleValue = seleValue;
			}

			public int getQuantity() {
						return quantity;
			}

			public void setQuantity(int quantity) {
						this.quantity = quantity;
			}
			
}
