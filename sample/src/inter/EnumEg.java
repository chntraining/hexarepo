package inter;

public class EnumEg {

	enum Months {
		JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
		NOVEMBER(11), DECEMBER(12);

		int value;

		Months() {
			System.out.println("From Constructor Enum");
		}

		Months(int value) {
			this.value = value;
			System.out.println("From Constructor Enum");

		}

		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		Months[] mons = Months.values();
		for (Months mon : mons) {
			System.out.println(mon);
		}

		for (Months mon : mons) {
			System.out.println(mon + " --> " + mon.ordinal());
		}
		System.out.println("*********Get Assigned Values************");
		for (Months mon : mons) {
			System.out.println(mon + " --> " + mon.getValue());
		}
		Months ch = Months.APRIL;
		switch (ch) {
		case JANUARY:
			System.out.println("JAN is the First month");
			break;
		case FEBRUARY:
			System.out.println("Feb is the 2nd month");
			break;
		case MARCH:
			System.out.println("Mar is the 3rd month");
			break;
		case APRIL:
			System.out.println("Apr is the 4th month");
			break;
		default:
			System.out.println("Other months plz work out");
		}

	}

}
