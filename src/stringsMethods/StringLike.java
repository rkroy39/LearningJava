package stringsMethods;

public class StringLike {
	public static void main(String[] args) {
		
		 final String withlistedPath1="/NCLAT_Documents/ncltdoc/casedoc/";
		 final String withlistedPath2="/NCLAT_Documents/CIS_Documents/casedoc/";
		 String docupload_path="/NCLAT_Documents/CIS_Documents/casedoc/NCLAT_Documents/ncltdoc/casedoc/NCLAT_Documents/...pdf";
		 //System.out.println(docupload_path.startsWith(withlistedPath2));
		 System.out.println(docupload_path.contains("."));
		 String a[]=docupload_path.split("/");
		
		int m= a.length;
		int count=0;
		for(int i=0;i<a[m-1].length();i++) {
			if(a[m-1].charAt(i)=='.') {
				count++;
			}
		}
		
		
		System.out.println(count);
		System.out.println(docupload_path);
		 

		
	}

}
