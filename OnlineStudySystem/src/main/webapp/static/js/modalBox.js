 (function() {
 	/*建立模态框对象*/
 	var modalBox = {};
 	/*获取模态框*/
 	modalBox.modal = document.getElementById("myModal");
     /*获得trigger按钮*/
 	modalBox.edit = document.getElementById("edit");
     /*获得关闭按钮*/
 	modalBox.closeBtn = document.getElementById("closeBtn");
 	/*模态框显示*/
 	modalBox.show = function() {
 		console.log(this.modal);
 		this.modal.style.display = "block";
 	}
 	/*模态框关闭*/
 	modalBox.close = function() {
 		this.modal.style.display = "none";
 	}
 	
     /*模态框初始化*/
 	modalBox.init = function() {
 		var that = this;
 		this.edit.onclick = function() {
             that.show();
 		}
 		this.closeBtn.onclick = function() {
 			that.close();
 		}
 	}
 	modalBox.init();
 
 })();