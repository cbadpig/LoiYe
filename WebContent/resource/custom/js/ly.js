(function(){

    if (!window.ly) {
        window['ly'] = {
            PROJECT_HUAISHU:"huaishu",
            NOTE_WJ:"wj",
            CACHE_BASE:'basepath',
            CACHE_BASE_HUAISHU_NOTE:'huaishu_note',
            CACHE_BASE_BAIYANG:'baiyang'

        }
    };

    if (!ly.huaishu) ly.huaishu = {
        createTitle:function() {
            ly.note.createTitle(ly.CACHE_BASE_HUAISHU_NOTE);
        },
        init:function (data) {
            ly.note.init(ly.CACHE_BASE_HUAISHU_NOTE,data);
        }
    }


    if (!ly.yh) ly.yh = {

    }

    /**
     * 【公用】文章缓存
     */
    if (!ly.note) ly.note = {
        createWjTitle:function(type) {
            var data = ly.storage.getSession(type);
            var note_wj = JSON.parse(data).wj;
            if (!note_wj) {
                return;
            }
            for (var i=0 ; i<note_wj.length ; i++) {
                if (i == 0) {
                    $("#wjTitle").append('<li id="'+ note_wj[i].id +'" class="ly-nav-active nav-item ly-nav-item position-relative">' +
                        '<a class="nav-link text-truncate"  href="javascript:void(0)" onclick=\'ly.note.openWz("'+ ly.CACHE_BASE_HUAISHU_NOTE +'","'+ note_wj[i].id +'")\'>'+ note_wj[i].bt +'</a>' +
                        '<i class="icon ion-ios-gear position-absolute ly-nav-i" >' +
                        '</i></li>').fadeIn("slow");
                    this.createWzTitle(type,note_wj[i].id);
                } else {
                    $("#wjTitle").append('<li id="'+ note_wj[i].id +'" class="ly-nav-nav-item ly-nav-item position-relative">' +
                        '<a class="nav-link text-truncate"  href="javascript:void(0)" onclick=\'ly.note.openWz("'+ ly.CACHE_BASE_HUAISHU_NOTE +'","'+ note_wj[i].id +'")\'>'+ note_wj[i].bt +'</a>' +
                        '<i class="icon ion-ios-gear position-absolute ly-nav-i" hidden>' +
                        '</i></li>').fadeIn("slow");
                }
            }
        },
        createWzTitle:function(type,wjId) {
            var data = ly.storage.getSession(type);
            var note_wz = JSON.parse(data)[wjId];
            
            $("#wzTitle").empty();
            if (!note_wz) {
                return;
            }
            
            for (var i=0 ; i<note_wz.length ; i++) {
                var wz = note_wz[i];
                if (i == 0) {
                	$("#wzTitle").append('<li class="nav-item ly-nav2-active ly-nav2-item position-relative">' +
                            '<i class="icon ion-android-document position-absolute ly-nav2-il"></i>' +
                            '<div class="nav-link ly-nav2-item-link">' +
                            '<p class="text-truncate ly-nav2-item-t">"'+ wz.bt +'"</p>' +
                            '<p class="text-truncate ly-nav2-item-p">"'+ wz.bt +'"</p>' +
                            '</div>' +
                            '<span class="ly-nav2-item-s">"'+ wz.wzzs +'"</span>' +
                            '<i class="icon ion-ios-gear position-absolute ly-nav2-i"></i>' +
                            '</li>');
                } else {
                	$("#wzTitle").append('<li class="nav-item ly-nav2-item position-relative">' +
                            '<i class="icon ion-android-document position-absolute ly-nav2-il"></i>' +
                            '<div class="nav-link ly-nav2-item-link">' +
                            '<p class="text-truncate ly-nav2-item-t">"'+ wz.bt +'"</p>' +
                            '<p class="text-truncate ly-nav2-item-p">"'+ wz.bt +'"</p>' +
                            '</div>' +
                            '<span class="ly-nav2-item-s">"'+ wz.wzzs +'"</span>' +
                            '<i class="icon ion-ios-gear position-absolute ly-nav2-i" hidden></i>' +
                            '</li>');
                }
            }

        },
        openWz:function(type,wjId) {
        	$("#wjTitle").children("li.ly-nav-active").children("i").hide();
        	$("#wjTitle").children("li.ly-nav-active").removeClass("ly-nav-active");
        	$("#"+wjId).addClass("ly-nav-active");
        	$("#"+wjId).children("i").show();
            this.createWzTitle(type,wjId);
        },
        init:function(type,data) {
            ly.storage.setSession(type,data);
            this.createWjTitle(type);
        }
    }

    if (!ly.url) ly.url = {

    };

    /**
     * 【公用】HTML5缓存封装
     */
    if (!ly.storage) ly.storage = {
        getSession: function(a) {
            return window.sessionStorage.getItem(a);
        },
        setSession: function(a, b) {
            if(ly.storage.getSession(a)) {
                ly.storage.removeSession(a);
            }
            window.sessionStorage.setItem(a, b);
        },
        removeSession: function(a) {
            window.sessionStorage.removeItem(a);
        },
        clearSession: function() {
            window.sessionStorage.clear();
        },
        getLocal: function(a) {
            return window.localStorage.getItem(a);
        },
        setLocal: function(a, b) {
            window.localStorage.setItem(a, b);
        },
        removeLocal: function(a) {
            window.localStorage.removeItem(a);
        },
        clearLocal: function() {
            window.localStorage.clear();
        }
    };
})();