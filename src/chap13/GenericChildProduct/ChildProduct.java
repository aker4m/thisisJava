package chap13.GenericChildProduct;

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;
	public C getCompanay(){
		return this.company;
	}
	public void setCompany(C company){
		this.company = company;
	}
}
