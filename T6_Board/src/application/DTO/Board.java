package application.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
<<<<<<< HEAD
import lombok.NoArgsConstructor;

/*
 * (DTO)
 * 게시글 정보
 * 					Java		DB
 * 	- 게시글 번호		no			no
 *  - 제목			title		title
 *  - 작성자			writer		writer
 *  - 내용			content		content
 *  - 등록일자			regDate		reg_date
 *  - 수정일자			updDate		upd_date
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	private int view;
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
		this.view = 0;
	}

=======

/**
 *  (DTO)
 *  게시글 정보
 *  				Java			DB
 *  - 게시글 번호		no				no
 *  - 제목			title			title
 *  - 작성자			writer			writer
 *  - 내용			content			content
 *  - 등록일자			regDate			reg_date
 *  - 수정일자			updDate			upd_date
 */
@Data
@AllArgsConstructor
public class Board {

	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	private int view;
	
	public Board() {
		this("(제목없음)", "(작성자없음)", "");
	}

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	
>>>>>>> refs/remotes/origin/main
}
