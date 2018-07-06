<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Content Counter (by Sun Yunmiao)</title>
    <script type="text/javascript">
        function countContent() {
            //提交form
            document.formRecords.action = "${pageContext.request.contextPath }/countContent.action";
            document.formRecords.submit();
        }
    </script>
</head>
<body>
<form name="formRecords" action="${pageContext.request.contextPath }/queryRecords.jsp" method="post">

    <table width="100%" border=1>
        <tr>
            <td>
                <input type="text" name="urlArticle" placeholder="输入文章链接"/>
                <input type="button" value="添加" onclick="countContent()"/>
            </td>
        </tr>
    </table>
    历史记录
    <table width="100%" border=1>
        <tr>
            <td>标题</td>
            <td>总字数</td>
            <td>中文字数</td>
            <td>英文字数</td>
            <td>标点符号数</td>
        </tr>
        <c:forEach items="${results }" var="result">
            <tr>
                <td><a href=${result.url}>${result.title }</a></td>
                <td>${result.countCharacter }</td>
                <td>${result.countChinese}</td>
                <td>${result.countEnglish }</td>
                <td>${result.countPunctuation }</td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>

</html>