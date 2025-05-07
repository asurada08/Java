//4.Anonymous class(1회용)
//클래스의 선언과 객체의 생성을 동시에 하는 이름이 
//없는 클래스(일회용: 한번만 사용하고 버려지는 객체를
//사용 할때 유용하게 쓰인다.Swing에서 많이 씀)
package innerClass;

import java.awt.Button;
import java.awt.Frame; //component
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AnonymousClass extends Frame {

	public static void main(String[] args) {
		//Frame 객체 생성
		AnonymousClass test = new AnonymousClass();
		//프레임 제목
		test.setTitle("익명 내부 클래스 연습...");
		Button btn = new Button("push button~");
		//프레임 크기 설정
		test.add(btn);
		
		//프레임 크기 설정
		test.setSize(500,300);
		//프레임 화면에 x, y 위치
		test.setLocation(1300, 100);
		
		test.setVisible(true);//화면에 프레임 보여주기
		//1인치 => 2.54cm
		//이벤트 발생
		//버튼을 클릭 했을시 이벤트 처리할 처리기(이벤트헨들러) 연결
		//이벤트 발생 시킬 소스.이벤트연결(이벤트처리기);
		btn.addActionListener(new ActionListener() {//
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				//이벤트를 발생한 버튼에 있는 글자를 대입
				String select = e.getActionCommand();//버튼의 글자 가져오기
				if(select.equals("push button~")) {
					System.out.println(select+".....");
					//시스템 종료 == 프로그램 종료 0
					System.exit(0);
				}
				
			}
		});//btn/**/
		/*test.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("close~");
				System.exit(0);
			}
		});//addWindowListener*/ //익명 처리기
		test.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
