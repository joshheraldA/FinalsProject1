package finalsProject;

abstract class Medicine {
	private double cost; 
	private int id, stock;
	private String picture, name;
	private String[] symptoms;
	
	/*
	 * constructor of medicine
	 * 
	 * @param {cost} cost of the medicine in php
	 * @param {id} id of the medicine
	 * @param {picture} relative picture path relating to the medicine
	 * @param {name} name of the medicine
	 * @param {symptoms} symptoms of the sickness the medicine is trying to solve
	 */
	public Medicine(double cost, int id, String picture, String name, String[] symptoms) {
		 this.setCost(cost);
		 this.setId(id);
		 this.setName(name);
		 this.setSymptoms(symptoms);
		 this.setPicture(picture);
	}
		
	/*
	 * returns the cost 
	 * @return {cost} the cost of the medicine
	 */
	public double getCost() { return this.cost; }
	
	/*
	 * returns the number of stocks of the medicine 
	 * @return {stock} remaining stocks of the medicine
	 */
	public int getStock() { return this.stock; }
	
	
	/*
	 * returns the id
	 * @return {id} the id of the medicine
	 */
	public int getId() { return this.id; }
	
	/*
	 * returns the picture 
	 * @return {picture} returns the relative path of the picture
	 */
	public String getPicture() { return this.picture; }
	
	
	/*
	 * returns the name
	 * @return {name} name of the medicine
	 */
	public String getName() { return this.name; }
	
	/*
	 * returns the Symptoms
	 * @return {symptoms} symptoms of the sickness that the medicine is trying to heal
	 */
	public String[] getSymptoms() { return this.symptoms; }
	
	
	
	/*
	 * set the cost php
	 * @param {cost} the new cost of the medicine in php
	 */
	public void setCost(double cost) { this.cost = cost; }
	
	/*
	 * set the id
	 * @param {id} the new id of the medicine
	 */
	public void setId(int id) { this.id = id; }
	
	/*
	 * set the picture
	 * @param {pictureRelativePath} the relative path of the picture of given medicine
	 */
	public void setPicture(String pictureRelativePath) { this.picture = pictureRelativePath; }
	
	
	/*
	 * set the name
	 * @param {name} the name of the medicine
	 */
	public void setName(String name) { this.name = name; }
	
	/* 
	 * set the symptoms
	 * @param {symptoms} the symptoms of the sickness the medicine is solving
	 */
	public void setSymptoms(String[] symptoms) { this.symptoms = symptoms; }
	
	/*
	 * set the stock
	 * #param {stock} the amount of stock you want to add
	 */
	public void setStock(int amount) { this.stock += amount; }
	
}
