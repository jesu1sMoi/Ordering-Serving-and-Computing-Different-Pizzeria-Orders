package pizzeria;
import java.util.*;

public class Order
{
	private ArrayList<PricedItem> pricedItems;

	public Order()
	{
		this.pricedItems = new ArrayList<PricedItem>();
	}

	public void addPricedItem(PricedItem pricedItem)
	{
		this.pricedItems.add(pricedItem);
	}

	public int getNumOfPricedItems()
	{
		return this.pricedItems.size();
	}

	public PricedItem getPricedItem(int index)
	{
		return this.pricedItems.get(index);
	}

	public double computeTotalPayment()
	{
		double total = 0;

		for(PricedItem p : this.pricedItems)
		{
			total += p.computePrice();
		}

		return total; 
	}
}