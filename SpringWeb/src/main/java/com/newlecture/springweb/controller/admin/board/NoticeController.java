package com.newlecture.springweb.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.springweb.entity.Notice;
import com.newlecture.springweb.entity.NoticeView;
import com.newlecture.springweb.entity.NoticeView;
import com.newlecture.springweb.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
		
		@Autowired
		private NoticeService service;
	
		@RequestMapping("list")
		public String list() {
			
			List<NoticeView> list = service.getList();
			
			return "admin.board.notice.list";
		}
		@RequestMapping("detail")
		public String detail() {
			
			Notice notice = service.get(1);
			
			return "admin.board.notice.detail";
		}
		@RequestMapping("edit")
		public String edit() {
			
			return "admin.board.notice.edit";
		}
		@RequestMapping("reg")
		public String reg() {
			
			return "admin.board.notice.reg";
		}
		@RequestMapping("del")
		public String del() {
			
			return "admin.board.notice.del";
		}
}
