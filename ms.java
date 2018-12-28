Scanner file = new Scanner(new FileInputStream("../.../output.txt"));
int count = 0;
while (file.hasNextLine()) { //whilst scanner has more lines
    Scanner s = new Scanner(file.nextLine());
    if(!file.hasNext()){
        break;
    }
    else{
        file.nextLine();
        count++;
    }
    s.close();
}
System.out.println("Number of paragraphs: "+ count);
file.close();
