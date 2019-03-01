public String getChar (int i
){
		String num;		
		String text = mini1Num.getText();
		
		Integer i = Integer.valueOf(text);

		return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;


	}
