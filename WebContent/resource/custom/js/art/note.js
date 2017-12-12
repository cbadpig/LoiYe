$(function () {
    init();
});
function init(type) {
    $.ajax({
        url:'ajax/note/wzwj',
        type:'get',
        dataType:'json',
        success:function (data) {
            if (data.flag) {
                ly.huaishu.init(data.message);
                if (type != 0) {
                	ly.huaishu.createWjTitle();
                }
            } else {
                alert("创建失败");
            }
        },
        error:function () {
            alert("创建失败");
        }
    });
}

function wjSubmit() {
    var wjName = $("#wjName").val();

    if (!wjName) {
    	alert("创建失败");
    	return;
    }
    
    $.ajax({
        url:'ajax/note/wzwj/insertWjTitle/',
        type:'POST',
        dataType:'json',
        data:{
            bt:wjName
        },
        success:function (data) {
        	$('.collapse').collapse('hide');
        	setTimeout(function () {
        		init();
        	},500);
        	$("#wjName").val("");
        },
        error:function () {
            alert("创建失败");
        }
    });
}

function addWz(type) {
	
	var wjId = $("#wjId").val();
	
	$.ajax({
        url:'ajax/note/wzwj/insertWzTitle/',
        type:'POST',
        dataType:'json',
        data:{
        	wjId:wjId,
        	type:type
        },
        success:function (data) {
        	if (data.flag) {
        		init(0);
        		ly.huaishu.initWzTitle(type,data.message);
        		console.log(data.message);
        	}
        	
        	
        },
        error:function () {
            alert("创建失败");
        }
    });
	
	
}