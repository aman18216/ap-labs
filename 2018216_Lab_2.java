import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
class app{
	//public boolean[] comp;
.
	public void displaymercury() {
		System.out.println("welcome to mercury");
		String[] comp = new String[5];
		comp[0] =  "enter details of merchant";
		comp[1] =  "enter details of customer";
		comp[2] =  "see user details";
		comp[3] =  "comapany account";
		comp[4] =  "exit";
		System.out.println(comp[0]);
		System.out.println(comp[1]);
		System.out.println(comp[2]);
		System.out.println(comp[3]);
		System.out.println(comp[4]);
		
	}
}
class merchent{
	public String Name;
	public String addresss;
	public int tot_amt;
	public merchent(String name, String addresss, int tot_amt) {
		super();
		Name = name;
		this.addresss = addresss;
		this.tot_amt = tot_amt;
	}
	private static ArrayList<merchent> mer_item2 = new ArrayList<merchent>();
	public void de_merchant(String name2) {
		for (merchent mer : mer_item2) {
			if(mer.Name.equals(name2)) {
                System.out.println(mer.Name);
                //System.out.println("course criteria");
                System.out.println(mer.addresss);
                System.out.println("total amount = " + mer.tot_amt);
                //System.out.println("Application status = " + mer.application_status);
            }
		}
	}
	public void dispalymerchent() {
		System.out.println("choose a merchent");
		String[] mer = new String[5];
		mer[0] =  "jack";
		mer[1] =  "aman";
		mer[2] =  "ashish";
		mer[3] =  "sachin";
		mer[4] =  "jay";
		System.out.println(mer[0]);
		System.out.println(mer[1]);
		System.out.println(mer[2]);
		System.out.println(mer[3]);
		System.out.println(mer[4]);
	}
	public void merchentmenu() {
		System.out.println("add a item");
		System.out.println("edit a item");
		System.out.println("search  a item");
		System.out.println("add a offer");
		System.out.println("print reward");
		System.out.println("exit");
		
	}
	
}
 class customer {
	
	public String name1;
	public String addresss;
	public  int no_order;
	public customer(String name1, String i, int no_order) {
		super();
		this.name1 = name1;
		this.addresss = i;
		this.no_order = no_order;
	}
	private static ArrayList<customer> mer_item3 = new ArrayList<customer>();
	public void de_merchant(String name3) {
		for (customer mer2 : mer_item3) {
			if(mer2.name1.equals(name3)) {
                System.out.println(mer2.name1);
                //System.out.println("course criteria");
                System.out.println(mer2.addresss);
                System.out.println("total amount = " + mer2.no_order);
                //System.out.println("Application status = " + mer.application_status);
            }
		}
	}
	public void customerlist() {
		System.out.println("search a item");
		System.out.println("checkout cart");
		System.out.println("rewards won");
		System.out.println("print rewards");
		//System.out.println("print reward");
		System.out.println("exit");
	}
	public void dispalycustomer() {
		String[] mer4 = new String[5];
		mer4[0] =  "john";
		mer4[1] =  "aman1";
		mer4[2] =  "ashish1";
		mer4[3] =  "sachin1";
		mer4[4] =  "jay1";
		System.out.println(mer4[0]);
		System.out.println(mer4[1]);
		System.out.println(mer4[2]);
		System.out.println(mer4[3]);
		System.out.println(mer4[4]);
	}
	
	
}
interface comspany{
	public void searching();
	public void printreward();
}

class merchanntitem implements comspany{
	public String itemname;
	public double itemprice;
	public int itemquantitiy;
	public String itemcategory;
	public int id;
	public int offer;
	public merchanntitem(int id,String itemname, double itemprice, int itemquantitiy,int offer, String itemcategory) {
		super();
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemquantitiy = itemquantitiy;
		this.itemcategory = itemcategory;
		this.id = id;
		this.offer = offer;
	}
	ArrayList<merchanntitem> mer_item = new ArrayList<merchanntitem>();
	public void  additem(int id,String itemname,double itemprice,int itemquantitiy,int offer, String itemcategory) {
		mer_item.add(new merchanntitem(id,itemname, itemprice,itemquantitiy,offer,itemcategory));
	}
	public int indexOf(Object p) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void addoffer() {
		String [] asus= new String[2];
		asus[0] = "buy one get one free";
		asus[1] = "25% off";
		System.out.println(asus[0]);
		System.out.println(asus[1]);
	}
	@Override
	public void searching() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printreward() {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
public class 2018216_Lab_2 {

	private static Object p;

	public static void main(String [] args) {
		String lol = null;
		int zs = 0;
		int r = 0;
		Double  p = 0.0;
		String catan = null;
		int df = 0;
		
		int zr =0;
		int r1 = 0;
		Double p1 = 0.0;
		String catan1 = null;
		String lol1 = null;
		int df1 =0;
		
		int zr1 =0;
		int r11 = 0;
		Double p11 = 0.0;
		String catan11 = null;
		String lol11 = null;
		
		int zr2 =0;
		int r2 = 0;
		Double p2= 0.0;
		String catan2 = null;
		String lol2 = null;
		
		
		ArrayList<merchent> comp =new  ArrayList<merchent>();
		ArrayList<customer> stud =new  ArrayList<customer>();
		Scanner scan = new Scanner (System.in);
		app a  = new app();
		merchent m = new merchent(null, null, 0);
		merchanntitem mm = new merchanntitem(0, null, 0, 0,0, null);
		customer cc  =new customer(null,null,0);
		a.displaymercury();
		int x= scan.nextInt();
		if (x == 10) {
			m.dispalymerchent();
			int y = scan.nextInt();
			if (y==1) {
				System.out.println("welcome back jack");
				System.out.println("merchent menu");
				m.merchentmenu();
				//int z = scan.nextInt();
				for (int i=0;i<=5;i++) {
					int z = scan.nextInt();
					if (z == 1) {
						System.out.println("enter the id");
						 zs = scan.nextInt();
						System.out.println("enter the item details");
						System.out.println("item name");
						lol = scan.next();
						System.out.println("item price");
						 p = scan.nextDouble();
						System.out.println("item quantitiy");
						 r = scan.nextInt();
						 df = scan.nextInt();
						System.out.println("item category");
						catan = scan.next();
						mm.additem(zs,lol,p,r,df,catan);
						System.out.println(z+" "+lol+" "+p+" "+r+" "+df+" "+catan);
						a.displaymercury();
					}
					if (z ==2) {
						ArrayList<merchanntitem> mer_item = new ArrayList<merchanntitem>();
						mm.additem(zs,lol,p,r,df,catan);
						System.out.println(zs+" "+lol+" "+p+" "+r+" "+df+" "+catan);
						System.out.println("edit the item jack");
						int xol = mm.indexOf(p);
						int rol  =mm.indexOf(r);
						int loi = scan.nextInt();
						int koi = scan.nextInt();
						//mer_item.set(xol, loi);
					}
					if (z==3) {
						System.out.println("choose a category");
						System.out.println(catan);
						int s= scan.nextInt();
						if (s==1) {
							mm.additem(zs,lol,p,r,df,catan);
							System.out.println(zs+" "+lol+" "+p+" "+r+" "+df+" "+catan);
						}
						
					}
					if (z==4) {
						System.out.println("choose item by code");
						mm.additem(zs,lol,p,r,df,catan);
						System.out.println(zs+" "+lol+" "+p+" "+r+" "+df+" "+catan);
						int sd = scan.nextInt();
						System.out.println("choose offer");
						mm.addoffer();
						int gh = scan.nextInt();
						if (gh == 1) {
							mm.additem(zs,lol,p,r+1,df,catan);
							r=r+1;
							System.out.println(zs+" "+lol+" "+p+" "+r+" "+df+" "+catan);
						}
						else if (gh ==2 ) {
							mm.additem(zs, lol, p, r, df, catan);
							String df11 = Integer.toString(df);
							df11 = "25 % off";
							System.out.println(zs+" "+lol+" "+p+" "+r+" "+df11+" "+catan);
							
						}
						
					}
					if (z == 5) {
						
					}
					if (z==6) {
						break;
					}
				}
				
			}
			for (int h =0;h<=5;h++) {
				if (y==2) {
					System.out.println("welcome back aman");
					System.out.println("merchent menu");
					m.merchentmenu();
					int zq = scan.nextInt();
					if (zq == 1) {
						System.out.println("enter the id");
						 zr = scan.nextInt();
						System.out.println("enter the item details");
						System.out.println("item name");
						lol1 = scan.next();
						System.out.println("item price");
						p1 = scan.nextDouble();
						System.out.println("item quantitiy");
						r1 = scan.nextInt();
						System.out.println("item category");
						catan1= scan.next();
						mm.additem(zr,lol1,p1,r1,df1,catan1);
					}
					if (zq ==2) {
						ArrayList<merchanntitem> mer_item = new ArrayList<merchanntitem>();
						mm.additem(zr,lol1,p1,r1,df,catan1);
						System.out.println(zr+" "+lol1+" "+p1+" "+r1+" "+df+" "+catan1);
						System.out.println("edit the item jack");
						int xol = mm.indexOf(p);
						int rol  =mm.indexOf(r);
						int loi = scan.nextInt();
						int koi = scan.nextInt();
						//mer_item.set(xol, loi);
					}
					if (zq==3) {
						System.out.println("choose a category");
						System.out.println(catan1);
						int s= scan.nextInt();
						if (s==1) {
							//mm.additem(zr,lol1,p1,r1,catan1);
							System.out.println(zr+" "+lol1+" "+p1+" "+r1+" "+df+" "+catan1);
						}
						
					}
					if (zq==4) {
						System.out.println("choose item by code");
						mm.additem(zr,lol1,p1,r1,df,catan1);
						System.out.println(zr+" "+lol1+" "+p1+" "+r1+" "+df+" "+catan1);
						int sd = scan.nextInt();
						System.out.println("choose offer");
						mm.addoffer();
						int gh = scan.nextInt();
						if (gh == 1) {
							mm.additem(zr,lol1,p1,r1+1,df,catan1);
							r=r+1;
							System.out.println(zr+" "+lol1+" "+p1+" "+r1+" "+df+" "+catan1);
						}
						else if (gh ==2 ) {
							mm.additem(zs, lol, p, r, df, catan);
							String df11 = Integer.toString(df);
							df11 = "25 % off";
							System.out.println(zr+" "+lol+" "+p+" "+r+" "+df11+" "+catan);
							
						}
						
						
					}
					if (zq == 6) {
						break ;
					}
			}
			}
			for(int g=0;g<=5;g++) {
				if (y ==3 ) {
					System.out.println("welcome back ashish");
					System.out.println("merchent menu");
					m.merchentmenu();
					int zt = scan.nextInt();
					if (zt == 1) {
						System.out.println("enter the id");
						 zr1 = scan.nextInt();
						System.out.println("enter the item details");
						System.out.println("item name");
						lol11 = scan.next();
						System.out.println("item price");
						p11 = scan.nextDouble();
						System.out.println("item quantitiy");
						r11 = scan.nextInt();
						System.out.println("item category");
						catan11 = scan.next();
						mm.additem(zr1,lol11,p11,r11,df,catan11);
						 
					}
					if (zt ==2) {
						ArrayList<merchanntitem> mer_item = new ArrayList<merchanntitem>();
						//mm.additem(zr1,lol11,p11,r11,catan11);
						System.out.println(zr1+" "+lol11+" "+p11+" "+r11+" "+catan11);
						System.out.println("edit the item jack");
						int xol = mm.indexOf(p);
						int rol  =mm.indexOf(r);
						int loi = scan.nextInt();
						int koi = scan.nextInt();
						//mer_item.set(xol, loi);
					}
					if (zt==3) {
						System.out.println("choose a category");
						System.out.println(catan11);
						int s= scan.nextInt();
						if (s==1) {
							//mm.additem(zr1,lol11,p11,r11,catan11);
							System.out.println(zr1+" "+lol11+" "+p11+" "+r11+" "+catan11);
						}
						
					}

				}
			}
			if (y==4) {
				System.out.println("welcome back sachin");
				System.out.println("merchent menu");
				m.merchentmenu();
				int zt = scan.nextInt();
				if (zt == 1) {
					System.out.println("enter the id");
					int fg = scan.nextInt();
					System.out.println("enter the item details");
					System.out.println("item name");
					String lol3 = scan.next();
					System.out.println("item price");
					Double p3 = scan.nextDouble();
					System.out.println("item quantitiy");
					int r3 = scan.nextInt();
					System.out.println("item category");
					String catan3 = scan.next();
					// mm.additem(fg,lol3,p3,r3,catan3);
				}
			}
			if (y==5) {
				System.out.println("welcome back jay");
				System.out.println("merchent menu");
				m.merchentmenu();
				int zy = scan.nextInt();
				if (zy == 1) {
					System.out.println("enter the id");
					int hy = scan.nextInt();
					System.out.println("enter the item details");
					System.out.println("item name");
					String lol4 = scan.next();
					System.out.println("item price");
					Double p4 = scan.nextDouble();
					System.out.println("item quantitiy");
					int r4 = scan.nextInt();
					System.out.println("item category");
					String catan4 = scan.next();
				}
				if (zy == 6) {
					//break;
				}
			}
		}
		if (x==20) {
			System.out.println("choose a customer");
			cc.dispalycustomer();
			int t = scan.nextInt();
			if (t==1) {
				System.out.println("welcome back john1");
				cc.customerlist();
				int u =scan.nextInt();
				if (u==1) {
					System.out.println("choose a category");
					System.out.println(catan1);
				}
				
			}
		}
		if (x==6) {
			
		}
		
			
		
		
		
		
	}
	
}