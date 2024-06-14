<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>   
 
	<h1>/board/list.jsp</h1>
	
	전달정보 : ${msg } <hr>
	
		<div class="box">
			<div class="box-header with-border">
				<h3 class="box-title"></h3>
			</div>

			<div class="box-body">
				<table class="table table-bordered">
					<tbody>
						<tr>
							<th style="width: 10px">BNO</th>
							<th>TITLE</th>
							<th>WRITER</th>
							<th>CONTENT</th>
							<th>REGDATE</th>
							<th style="width: 40px">VIEWCNT</th>
						</tr>
						
						<c:forEach var="vo" items="${boardList }">
						 <tr>
							<td>${vo.bno }</td>
							<td>${vo.title }</td>
							<td>${vo.writer }</td>
							<td>${vo.content }</td>
							<td>
								<fmt:formatDate type="both" value="${vo.regdate}" pattern="yyyy-MM-dd (a)HH:mm:ss"/>
								
							</td>
							<td><span class="badge bg-blue">${vo.viewcnt }</span></td>
						 </tr>
						</c:forEach>
						
					</tbody>
					
		</table>
					<!-- 모달창 -->
			<div class="modal fade" id="myModal" style="display: none;">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
							<h4 class="modal-title">아이티윌 게시판</h4>
						</div>
						<div class="modal-body">
							<p>One fine body…</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save changes</button>
						</div>
			<!--  모달창 끝 -->
			</div>

		</div>
		</div>
		</div>


	<!-- Jquery 사용 -->
	<script>
		$(document).ready(function(){
			
			// * jsp 페이지 구성요소의 실행 순서 
			// JAVA -> JSTL/EL -> HTML/CSS -> JS  -> Jquery
			
			//alert("${msg}");    => createOk가 출력됨 
			
			var result = "${msg}";
			
			if(result == "createOk"){
				//alert("글쓰기 완료! 리스트 페이지 이동");
				${"#myModal"}.modal("show");
			}
			
			Swal.fire("아이티윌 테스트!");

			
		});
	</script>		

	<%@ include file="../include/footer.jsp"%>