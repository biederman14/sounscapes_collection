 document.getElementById('button1').addEventListener('click', loadArtist);
    document.getElementById('button2').addEventListener('click', loadAlbum);
    document.getElementById('button3').addEventListener('click', loadSong);
    document.getElementById('addPost').addEventListener('submit', addArtist);
    document.getElementById('addPost1').addEventListener('submit', addSong);
    document.getElementById('addPost2').addEventListener('submit', addAlbum);


    

    function loadArtist(){
      var xhr = new XMLHttpRequest();
      xhr.open('GET', 'api/artists', true);

      xhr.onload = function(){
        if(this.status == 200){
          var user = JSON.parse(this.responseText);
          
          var output = '';
          
          for(var i in user){
            output += '<ul>' +
            '<li>Name: '+user[i].artistImage+'</li>' +
              '<li>Artist Hometown: '+user[i].artistHometown+'</li>' +
              '<li>Name: '+user[i].artistName+'</li>' +
              '</ul>';
          }

          document.getElementById('artist').innerHTML = output;
        }
      }

      xhr.send();
    }
    function loadAlbum(){
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'api/albums', true);

        xhr.onload = function(){
          if(this.status == 200){
            var user = JSON.parse(this.responseText);
            
            var output = '';
            
            for(var i in user){
              output += '<ul>' +
              '<li>Album Cover: '+user[i].albumImage+'</li>' +
                '<li>Album Title: '+user[i].albumTitle+'</li>' +
                '<li>Album Record Label: '+user[i].recordLabel+'</li>' +
                '</ul>';
            }

            document.getElementById('albums').innerHTML = output;
          }
        }

        xhr.send();
      }
    function loadSong(){
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'api/songs', true);

        xhr.onload = function(){
          if(this.status == 200){
            var user = JSON.parse(this.responseText);
            
            var output = '';
            
            for(var i in user){
              output += '<ul>' +
                '<li>Song Title: '+user[i].title+'</li>' +
                '<li>Song Duration: '+user[i].duration+'</li>' +
                '<li>Album Title: '+user[i].album.albumTitle+'</li>' +
                '</ul>';
                console.log(user)
            }

            document.getElementById('songs').innerHTML = output;
          }
        }

        xhr.send();
      }
    function addArtist(){
       

        let title = document.getElementById('artistName').value;
        let body = document.getElementById('artistHometown').value;

        fetch('artists/add', {
          method:'POST',
          headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-type':'application/json'
          },
          body:JSON.stringify({artistName:artistName, artistHometown:artistHometown})
        })
        .then((res) => res.json())
        .then((data) => console.log(data))
      }
    function addAlbum(){
        

        let title = document.getElementById('albumTitle').value;
        let body = document.getElementById('recordLabel').value;

        fetch('albums/add', {
          method:'POST',
          headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-type':'application/json'
          },
          body:JSON.stringify({albumTitle:albumTitle,recordLabel:recordLabel})
        })
        .then((res) => res.json())
        .then((data) => console.log(data))
      }
    function addSong(){
        

        let title = document.getElementById('title').value;
        let body = document.getElementById('duration').value;

        fetch('songs/add', {
          method:'POST',
          headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-type':'application/json'
          },
          body:JSON.stringify({title:title, duration:duration})
        })
        .then((res) => res.json())
        .then((data) => console.log(data))
      }
    function myFunction() {
        var x = document.querySelector("myDIV");
        if (x.style.display === "none") {
            x.style.display = "block";
        } else {
            x.style.display = "none";
        }
    }