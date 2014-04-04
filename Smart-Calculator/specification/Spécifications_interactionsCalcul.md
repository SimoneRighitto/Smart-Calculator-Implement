




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>Smart-Calculator/specification/Spécifications_interactionsCalcul.md at master · schodaw/Smart-Calculator</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="schodaw/Smart-Calculator" name="twitter:title" /><meta content="Smart-Calculator - A repository for the Smart Calculator Lab (RES course taught at the HEIG-VD)" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/6839114?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/6839114?s=400" property="og:image" /><meta content="schodaw/Smart-Calculator" property="og:title" /><meta content="https://github.com/schodaw/Smart-Calculator" property="og:url" /><meta content="Smart-Calculator - A repository for the Smart Calculator Lab (RES course taught at the HEIG-VD)" property="og:description" />

    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="534E6A8B:425C:1C7CEDB:533ED81E" name="octolytics-dimension-request_id" /><meta content="6839102" name="octolytics-actor-id" /><meta content="SimoneRighitto" name="octolytics-actor-login" /><meta content="18d833d5c5a61699478e8464069101b212082872314ecf449d8eb852afa39fc0" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://github.global.ssl.fastly.net/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="DLEKSRM7z0g5amvDLFcUfs7Vc+5BpupEDDOp3sDovh4=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-23e4a1546f069fb600f5a3415dc0b48a3eeb217c.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-146be87fda3fe0f73441aec6281ca6863de5eafb.css" media="all" rel="stylesheet" type="text/css" />
    


        <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-dca097f6f454ee06b43ea4817a154392e3caf824.js" type="text/javascript"></script>
        <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-80fea33de58cd35419afdc5675b632d07ce22b7b.js" type="text/javascript"></script>
        
        
      <meta http-equiv="x-pjax-version" content="7c0b61885069bf72bd82e01bb450992b">

        <link data-pjax-transient rel='permalink' href='/schodaw/Smart-Calculator/blob/560fb4d662d9d1b8bb2af345664ba3046f83d3e5/specification/Sp%C3%A9cifications_interactionsCalcul.md'>

  <meta name="description" content="Smart-Calculator - A repository for the Smart Calculator Lab (RES course taught at the HEIG-VD)" />

  <meta content="6839114" name="octolytics-dimension-user_id" /><meta content="schodaw" name="octolytics-dimension-user_login" /><meta content="18146578" name="octolytics-dimension-repository_id" /><meta content="schodaw/Smart-Calculator" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="true" name="octolytics-dimension-repository_is_fork" /><meta content="17978228" name="octolytics-dimension-repository_parent_id" /><meta content="wasadigi/Smart-Calculator" name="octolytics-dimension-repository_parent_nwo" /><meta content="17978228" name="octolytics-dimension-repository_network_root_id" /><meta content="wasadigi/Smart-Calculator" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/schodaw/Smart-Calculator/commits/master.atom" rel="alternate" title="Recent Commits to Smart-Calculator:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public fork page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status unread"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey=" s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="SimoneRighitto"
      data-repo="schodaw/Smart-Calculator"
      data-branch="master"
      data-sha="765b05e6bc70edd0ecf155266e2fbf75577b69e3"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="schodaw/Smart-Calculator" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/SimoneRighitto" class="name">
        <img alt="SimoneRighitto" class=" js-avatar" data-user="6839102" height="20" src="https://avatars0.githubusercontent.com/u/6839102?s=140" width="20" /> SimoneRighitto
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <a class="tooltipped tooltipped-s" href="/logout" data-method="post" id="logout" aria-label="Sign out">
        <span class="octicon octicon-log-out"></span>
      </a>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="schodaw/Smart-Calculator">This repository</span>
    </li>
      <li>
        <a href="/schodaw/Smart-Calculator/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="DLEKSRM7z0g5amvDLFcUfs7Vc+5BpupEDDOp3sDovh4=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="18146578" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/schodaw/Smart-Calculator/watchers">
        3
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/schodaw/Smart-Calculator/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" title="Unstar schodaw/Smart-Calculator" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/schodaw/Smart-Calculator/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" title="Star schodaw/Smart-Calculator" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/schodaw/Smart-Calculator/stargazers">
        0
      </a>
  </div>

  </li>


        <li>
          <a href="/schodaw/Smart-Calculator/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of schodaw/Smart-Calculator to your account" aria-label="Fork your own copy of schodaw/Smart-Calculator to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/schodaw/Smart-Calculator/network" class="social-count">18</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo-forked"></span>
          <span class="author">
            <a href="/schodaw" class="url fn" itemprop="url" rel="author"><span itemprop="title">schodaw</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/schodaw/Smart-Calculator" class="js-current-repository js-repo-home-link">Smart-Calculator</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

            <span class="fork-flag">
              <span class="text">forked from <a href="/wasadigi/Smart-Calculator">wasadigi/Smart-Calculator</a></span>
            </span>
        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/schodaw/Smart-Calculator" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /schodaw/Smart-Calculator">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/schodaw/Smart-Calculator/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /schodaw/Smart-Calculator/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/schodaw/Smart-Calculator/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /schodaw/Smart-Calculator/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/schodaw/Smart-Calculator/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /schodaw/Smart-Calculator/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/schodaw/Smart-Calculator/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /schodaw/Smart-Calculator/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/schodaw/Smart-Calculator/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /schodaw/Smart-Calculator/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/schodaw/Smart-Calculator/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /schodaw/Smart-Calculator/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url "
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/schodaw/Smart-Calculator.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/schodaw/Smart-Calculator.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url open"
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:schodaw/Smart-Calculator.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:schodaw/Smart-Calculator.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/schodaw/Smart-Calculator" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/schodaw/Smart-Calculator" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="github-windows://openRepo/https://github.com/schodaw/Smart-Calculator" class="minibutton sidebar-button" title="Save schodaw/Smart-Calculator to your computer and use it in GitHub Desktop." aria-label="Save schodaw/Smart-Calculator to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/schodaw/Smart-Calculator/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download schodaw/Smart-Calculator as a zip file"
                   title="Download schodaw/Smart-Calculator as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:c6f8be62cf0a87c8976822028a8efa01 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/schodaw/Smart-Calculator/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schodaw/Smart-Calculator/blob/master/specification/Sp%C3%A9cifications_interactionsCalcul.md"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schodaw/Smart-Calculator" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">Smart-Calculator</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schodaw/Smart-Calculator/tree/master/specification" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">specification</span></a></span><span class="separator"> / </span><strong class="final-path">Spécifications_interactionsCalcul.md</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="specification/Spécifications_interactionsCalcul.md" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="schodaw" class="main-avatar js-avatar" data-user="6839114" height="24" src="https://avatars0.githubusercontent.com/u/6839114?s=140" width="24" />
    <span class="author"><a href="/schodaw" rel="author">schodaw</a></span>
    <time class="js-relative-date" data-title-format="YYYY-MM-DD HH:mm:ss" datetime="2014-03-31T13:32:57+02:00" title="2014-03-31 13:32:57">March 31, 2014</time>
    <div class="commit-title">
        <a href="/schodaw/Smart-Calculator/commit/560fb4d662d9d1b8bb2af345664ba3046f83d3e5" class="message" data-pjax="true" title="Update Spécifications_interactionsCalcul.md">Update Spécifications_interactionsCalcul.md</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong>  contributors</a></p>
          <a class="avatar tooltipped tooltipped-s" aria-label="schodaw" href="/schodaw/Smart-Calculator/commits/master/specification/Sp%C3%A9cifications_interactionsCalcul.md?author=schodaw"><img alt="schodaw" class=" js-avatar" data-user="6839114" height="20" src="https://avatars0.githubusercontent.com/u/6839114?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="Swissdelta" href="/schodaw/Smart-Calculator/commits/master/specification/Sp%C3%A9cifications_interactionsCalcul.md?author=Swissdelta"><img alt="Swissdelta" class=" js-avatar" data-user="6839154" height="20" src="https://avatars2.githubusercontent.com/u/6839154?s=140" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="schodaw" class=" js-avatar" data-user="6839114" height="24" src="https://avatars0.githubusercontent.com/u/6839114?s=140" width="24" />
            <a href="/schodaw">schodaw</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Swissdelta" class=" js-avatar" data-user="6839154" height="24" src="https://avatars2.githubusercontent.com/u/6839154?s=140" width="24" />
            <a href="/Swissdelta">Swissdelta</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>444 lines (283 sloc)</span>
          <span class="meta-divider"></span>
        <span>14.039 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/schodaw/Smart-Calculator?branch=master&amp;filepath=specification%2FSp%C3%A9cifications_interactionsCalcul.md" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/schodaw/Smart-Calculator/edit/master/specification/Sp%C3%A9cifications_interactionsCalcul.md"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/schodaw/Smart-Calculator/raw/master/specification/Sp%C3%A9cifications_interactionsCalcul.md" class="button minibutton " id="raw-url">Raw</a>
            <a href="/schodaw/Smart-Calculator/blame/master/specification/Sp%C3%A9cifications_interactionsCalcul.md" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/schodaw/Smart-Calculator/commits/master/specification/Sp%C3%A9cifications_interactionsCalcul.md" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon tooltipped tooltipped-s"
               href="/schodaw/Smart-Calculator/delete/master/specification/Sp%C3%A9cifications_interactionsCalcul.md"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
      
  <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1>
<a name="user-content-distributed-computing-protocol-v10-specification--interactions-after-dynamic-discovery" class="anchor" href="#distributed-computing-protocol-v10-specification--interactions-after-dynamic-discovery"><span class="octicon octicon-link"></span></a>Distributed Computing Protocol V1.0 Specification : interactions after dynamic discovery</h1>

<pre><code>Author              : Dominique Jollien and Frédéric Saam, HEIG-VD
Last revision date  : 30.03.2014

Revision history
         30.03.2014 : Finalized the v1.0 specification
</code></pre>

<h2>
<a name="user-content-1-introduction" class="anchor" href="#1-introduction"><span class="octicon octicon-link"></span></a>1. Introduction</h2>

<p>The Distributed Computing Protocol (DCP) is an application-level
protocol that describes the operation of a distributed system used to
perform distributed computing.</p>

<p>The goal of such a distributed system is to allow clients to access
computing servers and ask them for computation results.</p>

<p>This document will describe the interactions between the servers able to
provide computation and the clients once they have established a
connection.</p>

<h2>
<a name="user-content-2-terminology" class="anchor" href="#2-terminology"><span class="octicon octicon-link"></span></a>2. Terminology</h2>

<p><strong>Smart Calculator</strong>: a client in our DCP specification. This client
connects to Compute Engine to ask them to perform computation.</p>

<p><strong>Compute Engine</strong>: a server in our DCP specification. This server
recieve computation requests from clients and reply them with the
result. A compute Engine can be public or private, if he is private the
Smart Calculator connecting to him must possess a recognized account by
him.</p>

<p><strong>Compute Function</strong>: a computation of which a Compute Engine is capable
of. A Compute Function may require data input to be performed.</p>

<p><strong>Compute Result</strong>: a result of a Compute Function as computed by a
Compute Engine.</p>

<h2>
<a name="user-content-3-protocol-overview" class="anchor" href="#3-protocol-overview"><span class="octicon octicon-link"></span></a>3. Protocol Overview</h2>

<h3>
<a name="user-content-31-system-architecture" class="anchor" href="#31-system-architecture"><span class="octicon octicon-link"></span></a>3.1. System Architecture</h3>

<p>Just an overview of the system architecture and the messages between the
components.</p>

<h3>
<a name="user-content-32-system-components" class="anchor" href="#32-system-components"><span class="octicon octicon-link"></span></a>3.2. System Components</h3>

<p><a href="/schodaw/Smart-Calculator/blob/master/specification/img/componentDiagram.png" target="_blank"><img src="/schodaw/Smart-Calculator/raw/master/specification/img/componentDiagram.png" alt="" style="max-width:100%;"></a></p>

<h4>
<a name="user-content-321-smart-calculator" class="anchor" href="#321-smart-calculator"><span class="octicon octicon-link"></span></a>3.2.1. Smart Calculator</h4>

<p>A client in our DCP specification. This client connects to Compute
Engine which announce themself on the network to ask them to perform
computation.</p>

<h4>
<a name="user-content-322-compute-engine" class="anchor" href="#322-compute-engine"><span class="octicon octicon-link"></span></a>3.2.2. Compute Engine</h4>

<p>A service provider in our DCP specification. This component must be able
to listen for client connection request and send broadcast datagrams to
announce themself to the network.</p>

<p>This server recieve computation requests from clients and reply them
with the result.</p>

<p>If the Compute Engine is private it must have access to a user database
to check the credentials given by clients.</p>

<h3>
<a name="user-content-33-interactions-between-components" class="anchor" href="#33-interactions-between-components"><span class="octicon octicon-link"></span></a>3.3. Interactions Between Components</h3>

<p>The overall interactions between components are shown on the diagram in
chapter 3.1.</p>

<h2>
<a name="user-content-4-protocol-details" class="anchor" href="#4-protocol-details"><span class="octicon octicon-link"></span></a>4. Protocol Details</h2>

<h3>
<a name="user-content-41-transport-protocols-and-connections" class="anchor" href="#41-transport-protocols-and-connections"><span class="octicon octicon-link"></span></a>4.1. Transport Protocols and Connections</h3>

<p>The dynamic service discovery used by this protocol is described in the
"Dynamic Discovery" specification document.</p>

<p>Interactions between the Smart Calculator and the Compute Engine after
the dynamic service discovery are done via TCP. The default listening
port for Compute Engines is 6060.</p>

<p>To establish a connection with a Compute Engine, after having
dynamically discovered it, the Smart Calculator send him a
CONNECTION_REQUEST message.</p>

<p>If the Compute Engine is private he follows the connection process with
a LOGIN_REQUIRED message.</p>

<p>The Smart Calculator can then reply with a USER_CREDENTIALS message and
be logged in if the given credentials are recognize by the compute
engine or he can ask for registration in the Compute Engine's user
database with a REGISTRATION_REQUEST message which will be replied by a
REGISTRATION_REPLY.</p>

<p>He must then reply with a NEW_USER_CREDENTIALS to register himself
which will be replied either by a REGISTRATION_FAILURE or
REGISTRATION_SUCCESS.</p>

<p>Once his account is created he can go back to logging in.</p>

<h3>
<a name="user-content-42-state-management" class="anchor" href="#42-state-management"><span class="octicon octicon-link"></span></a>4.2. State Management</h3>

<p>This protocol is stageful.</p>

<p><a href="/schodaw/Smart-Calculator/blob/master/specification/img/stateMachineDiagram.png" target="_blank"><img src="/schodaw/Smart-Calculator/raw/master/specification/img/stateMachineDiagram.png" alt="" style="max-width:100%;"></a></p>

<h4>
<a name="user-content-421-initial-state-listening-for-connection-request" class="anchor" href="#421-initial-state-listening-for-connection-request"><span class="octicon octicon-link"></span></a>4.2.1. Initial state (listening for connection request)</h4>

<p>In this state the Compute Engine is listening for CONNECTION_REQUEST
from the Smart Calculator.</p>

<p>When he receives one, he reply with LOGIN_REQUIRED and goes in the
state Authentication if he is private but he replies with
FUNCTIONS_LIST and goes it the state Waiting_computing_request if he
is public.</p>

<h4>
<a name="user-content-422-state-authentication" class="anchor" href="#422-state-authentication"><span class="octicon octicon-link"></span></a>4.2.2. State Authentication</h4>

<p>Used if the Compute Engine is private and the user has to log in.</p>

<p>In this state the Compute Engine can receive from the Smart Calculator :</p>

<ul>
<li><p>USER_CREDENTIALS in which case he check the credentials and replies
with LOGIN_FAILURE or send FUNCTIONS_LIST and goes in the state
Waiting_computing_request.</p></li>
<li><p>REGISTRATION_REQUEST in which case he reply with
REGISTRATION_REPLY and goes in the state REGISTRATION.</p></li>
</ul><h4>
<a name="user-content-423-state-registration" class="anchor" href="#423-state-registration"><span class="octicon octicon-link"></span></a>4.2.3. State Registration</h4>

<p>Used if the Compute Engine is private and the user wants to create a new
account.</p>

<p>In this state the Compute Engine can receive from the Smart Calculator :</p>

<ul>
<li><p>NEW_USER_CREDENTIALS in which case he tries to create a new
account with the credentials and replies with REGISTRATION_FAILURE
or REGISTRATION_SUCCESS.</p></li>
<li><p>CONNECTION_REQUEST in which case he reply with LOGIN_REQUIRED and
goes in the state Authentication.</p></li>
</ul><h4>
<a name="user-content-424-state-waiting_computing_request" class="anchor" href="#424-state-waiting_computing_request"><span class="octicon octicon-link"></span></a>4.2.4. State Waiting_computing_request</h4>

<p>Used if a Smart Calculator is connected of the Compute Engine and no
task is currently performing.</p>

<p>In this state the Compute Engine can receive from the Smart Calculator :</p>

<ul>
<li><p>COMPUTING_REQUEST in which case he replies with UNKOWN_FUNCTION if
the name of the computing function asked is wrong otherwise he goes
in the state compute_request.</p></li>
<li><p>BYE in which case he closes the connection.</p></li>
</ul><h4>
<a name="user-content-425-state-compute_request" class="anchor" href="#425-state-compute_request"><span class="octicon octicon-link"></span></a>4.2.5. State compute_request</h4>

<p>Used if a Compute Engine is processing inputs for a requested compute
function.</p>

<p>In this state the Compute Engine can send to the Smart Calculator :</p>

<ul>
<li><p>INPUTS_REQUEST in which case he goes in the state Waiting_inputs.</p></li>
<li><p>LIST_INPUTS_REQUEST in which case he goes in the state
Waiting_list_inputs.</p></li>
<li><p>COMPUTING_RESULT in which case he goes in the state
Waiting_computing_request.</p></li>
<li><p>COMPUTING_FAILURE in which case he goes in the state
Waiting_computing_request.</p></li>
</ul><h4>
<a name="user-content-426-state-waiting_inputs" class="anchor" href="#426-state-waiting_inputs"><span class="octicon octicon-link"></span></a>4.2.6. State Waiting_inputs</h4>

<p>Used if a Compute Enging is asking for a certain number of inputs for a
requested compute function.</p>

<p>In this state the Compute Engine can receive from the Smart Calculator :</p>

<ul>
<li>  INPUTS_REPLY in which case he goes in the state compute_request.</li>
</ul><h4>
<a name="user-content-427-state-waiting_list_inputs" class="anchor" href="#427-state-waiting_list_inputs"><span class="octicon octicon-link"></span></a>4.2.7. State Waiting_list_inputs</h4>

<p>Used if a Compute Enging is asking for an unknown number of inputs for a
requested compute function.</p>

<p>In this state the Compute Engine can receive from the Smart Calculator :</p>

<ul>
<li><p>LIST_INPUTS_REPLY in which case he store an additional input.</p></li>
<li><p>LIST_INPUTS_ENDOFREPLY in which case he goes in the state
compute_result.</p></li>
</ul><h3>
<a name="user-content-43-message-types-syntax-and-semantics" class="anchor" href="#43-message-types-syntax-and-semantics"><span class="octicon octicon-link"></span></a>4.3. Message Types, Syntax and Semantics</h3>

<p>All the messages are encoded in JSON.</p>

<h4>
<a name="user-content-431-connection" class="anchor" href="#431-connection"><span class="octicon octicon-link"></span></a>4.3.1 Connection</h4>

<p>Connection between a Smart Calculator and a Compute Engine.</p>

<h5>
<a name="user-content-4311-message-connection_request" class="anchor" href="#4311-message-connection_request"><span class="octicon octicon-link"></span></a>4.3.1.1 Message CONNECTION_REQUEST</h5>

<p>Sent by a Smart Calculator to a Compute Engine on it's listening port.
Asks for a connection with the Compute Engine. If he is public the
message is simply replied by FUNCTIONS_LIST otherwise it's replied by
LOGIN_REQUIRED.</p>

<p>Payload : {"MESSAGE_TYPE" : "CONNECTION_REQUEST"}</p>

<h5>
<a name="user-content-4312-message-login_required" class="anchor" href="#4312-message-login_required"><span class="octicon octicon-link"></span></a>4.3.1.2 Message LOGIN_REQUIRED</h5>

<p>Sent by a private Compute Engine to a Smart Calculator that sent
CONNECTION_REQUEST. Asks the Smart Calculator for a user id and
password.</p>

<p>Payload : {"MESSAGE_TYPE" : "LOGIN_REQUIRED"}</p>

<h5>
<a name="user-content-4313-message-user_credentials" class="anchor" href="#4313-message-user_credentials"><span class="octicon octicon-link"></span></a>4.3.1.3 Message USER_CREDENTIALS</h5>

<p>Sent by a Smart Calculator to a private Compute Engine that sent
LOGIN_REQUIRED. Provide user credentials that must be known by the
Compute Engine to successfully log in the user. The user password is
hashed in sha-256.</p>

<p>Payload : {"MESSAGE_TYPE" : "USER_CREDENTIALS", "USER_ID" : "the user
id provided", "USER_PASSWORD" : "the user password provided"}</p>

<h4>
<a name="user-content-4314-message-login_failure" class="anchor" href="#4314-message-login_failure"><span class="octicon octicon-link"></span></a>4.3.1.4 Message LOGIN_FAILURE</h4>

<p>Sent by a private Compute Engine to a Smart Calculator that sent
USER_CREDENTIALS.</p>

<p>Inform the Smart Calculator he is not logged in. The reasons are given
in the EXPLANATIONS field.</p>

<p>Payload : {"MESSAGE_TYPE" : "LOGIN_FAILURE", "EXPLANATIONS" :
"explanations of the reasons of the failure"}</p>

<h5>
<a name="user-content-4315-message-registration_request" class="anchor" href="#4315-message-registration_request"><span class="octicon octicon-link"></span></a>4.3.1.5 Message REGISTRATION_REQUEST</h5>

<p>Sent by a Smart Calculatorto a private Compute Engine that sent
LOGIN_REQUIRED. Ask the Compute Engine for registration of a new user
in his user database.</p>

<p>Payload : {"MESSAGE_TYPE" : "REGISTRATION_REQUEST"}</p>

<h5>
<a name="user-content-4316-message-registration_reply" class="anchor" href="#4316-message-registration_reply"><span class="octicon octicon-link"></span></a>4.3.1.6 Message REGISTRATION_REPLY</h5>

<p>Sent by a private Compute Engine to a Smart Calculator that sent
REGISTRATION_REQUEST. Asks the Smart Calculator for a user id, a
password and an email.</p>

<p>Payload : {"MESSAGE_TYPE" : "REGISTRATION_REPLY"}</p>

<h5>
<a name="user-content-4317-message-new_user_credentials" class="anchor" href="#4317-message-new_user_credentials"><span class="octicon octicon-link"></span></a>4.3.1.7 Message NEW_USER_CREDENTIALS</h5>

<p>Sent by a Smart Calculator to a private Compute Engine that sent
REGISTRATION_REPLY. Provide new user credentials to let the Compute
Engine create a new user account. The user password is hashed in
sha-256.</p>

<p>Payload : {"MESSAGE_TYPE" : "NEW_USER_CREDENTIALS", "USER_ID" : "the
user id provided", "USER_PASSWORD" : "the user password provided",
"USER_EMAIL" : "the user email provided"}</p>

<h5>
<a name="user-content-4318-message-registration_success" class="anchor" href="#4318-message-registration_success"><span class="octicon octicon-link"></span></a>4.3.1.8 Message REGISTRATION_SUCCESS</h5>

<p>Sent by a private Compute Engine to a Smart Calculator that sent
NEW_USER_CREDENTIALS. Inform the Smart Calculator that his new account
has been created and he can use it to log himself in this Compute
Engine.</p>

<p>Payload : {"MESSAGE_TYPE" : "REGISTRATION_SUCCESS"}</p>

<h5>
<a name="user-content-4319-message-registration_failure" class="anchor" href="#4319-message-registration_failure"><span class="octicon octicon-link"></span></a>4.3.1.9 Message REGISTRATION_FAILURE</h5>

<p>Sent by a private Compute Engine to a Smart Calculator that sent
NEW_USER_CREDENTIALS. Inform the Smart Calculator that his new account
has not been created. The reasons are given in the EXPLANATIONS field.</p>

<p>Payload : {"MESSAGE_TYPE" : "REGISTRATION_FAILURE", "EXPLANATIONS" :
"explanations of the reasons of the failure"}</p>

<h4>
<a name="user-content-43110-message-bye" class="anchor" href="#43110-message-bye"><span class="octicon octicon-link"></span></a>4.3.1.10 Message BYE</h4>

<p>Sent by a Smart Calculator to a private Compute Engine after a
successfull authentication. Log out of the Smart Calculator on the
Compute Engine. Can also be send by the Compute Engine to the Smart
Calculator to terminate the session.</p>

<p>Payload : {"MESSAGE_TYPE" : "BYE"}</p>

<h4>
<a name="user-content-432-computing" class="anchor" href="#432-computing"><span class="octicon octicon-link"></span></a>4.3.2 Computing</h4>

<p>Computing requests and replies between a Smart Calculator and a Compute
Engine after a successful connection.</p>

<h4>
<a name="user-content-4321-functions_list" class="anchor" href="#4321-functions_list"><span class="octicon octicon-link"></span></a>4.3.2.1 FUNCTIONS_LIST</h4>

<p>Sent by a Compute Engine to a Smart Calculator that successfully
connected (by simply sending a CONNECTION_REQUEST if the Compute Engine
is public or by going through the logging process). Inform the Smart
Calculator of the computing functions the Compute Engine is capable.</p>

<p>Payload : {"MESSAGE_TYPE" : "FUNCTIONS_LIST",</p>

<p>"FUNCTIONS" : {</p>

<p>"the name of a computing function" : "description of the computing
function",</p>

<p>"the name of another computing function" : "description of the computing
function",</p>

<p>...</p>

<p>}}</p>

<h4>
<a name="user-content-4322-computing_request" class="anchor" href="#4322-computing_request"><span class="octicon octicon-link"></span></a>4.3.2.2 COMPUTING_REQUEST</h4>

<p>Sent by a Smart Calculato to a Compute Engine that sent FUNCTIONS_LIST.
Ask the Compute Engine to perform a computing function he is capable of.</p>

<p>Payload : {"MESSAGE_TYPE" : "COMPUTING_REQUEST","FUNCTION" : "the
name of a computing function"}</p>

<h4>
<a name="user-content-4323-unkown_function" class="anchor" href="#4323-unkown_function"><span class="octicon octicon-link"></span></a>4.3.2.3 UNKOWN_FUNCTION</h4>

<p>Sent by a Compute Engine to a Smart Calculator that sent
COMPUTING_REQUEST with an unrecognised computing function name.</p>

<p>Payload : {"MESSAGE_TYPE" : "UNKOWN_FUNCTION","FUNCTION" : "the
name of a computing function"}</p>

<h4>
<a name="user-content-4324-inputs_request" class="anchor" href="#4324-inputs_request"><span class="octicon octicon-link"></span></a>4.3.2.4 INPUTS_REQUEST</h4>

<p>Sent by a Compute Engine to a Smart Calculator that sent
COMPUTING_REQUEST if the computing function that is requested requires
a certain number of input.</p>

<p>Payload : {"MESSAGE_TYPE" : "INPUTS_REQUEST",</p>

<p>"INPUTS" : {"1" : "the name of a required input", "2" : "the name of another
required input", ...}</p>

<p>}</p>

<h4>
<a name="user-content-4325-inputs_reply" class="anchor" href="#4325-inputs_reply"><span class="octicon octicon-link"></span></a>4.3.2.5 INPUTS_REPLY</h4>

<p>Sent by a Smart Calculator to a Compute Engine to that sent
INPUTS_REQUEST. Provide a value for each required input.</p>

<p>Payload : {"MESSAGE_TYPE" : "INPUTS_REPLY",</p>

<p>"INPUTS" : {</p>

<p>"the name of a required input" : "the value of the input",</p>

<p>"the name of another required input" : "the value of the input",</p>

<p>...</p>

<p>}}</p>

<h4>
<a name="user-content-4326-list_inputs_request" class="anchor" href="#4326-list_inputs_request"><span class="octicon octicon-link"></span></a>4.3.2.6 LIST_INPUTS_REQUEST</h4>

<p>Sent by a Compute Engine to a Smart Calculator that sent
COMPUTING_REQUEST if the computing function that is requested requires
an unkown number of input.</p>

<p>Payload : {"MESSAGE_TYPE" : "LIST_INPUTS_REQUEST"}</p>

<h4>
<a name="user-content-4327-list_inputs_reply" class="anchor" href="#4327-list_inputs_reply"><span class="octicon octicon-link"></span></a>4.3.2.7 LIST_INPUTS_REPLY</h4>

<p>Sent by a Smart Calculator to a Compute Engine to that sent
LIST_INPUTS_REQUEST. Provide a value an input.</p>

<p>Payload : {"MESSAGE_TYPE" : "LIST_INPUTS_REPLY", "INPUT" : "the value
of the input"}</p>

<h4>
<a name="user-content-4328-list_inputs_endofreply" class="anchor" href="#4328-list_inputs_endofreply"><span class="octicon octicon-link"></span></a>4.3.2.8 LIST_INPUTS_ENDOFREPLY</h4>

<p>Sent by a Smart Calculator to a Compute Engine to that sent
LIST_INPUTS_REQUEST. Inform the Compute Engine that all the inputs
have been sent.</p>

<p>Payload : {"MESSAGE_TYPE" : "LIST_INPUTS_ENDOFREPLY"}</p>

<h4>
<a name="user-content-4329-computing_result" class="anchor" href="#4329-computing_result"><span class="octicon octicon-link"></span></a>4.3.2.9 COMPUTING_RESULT</h4>

<p>Sent by Compute Engine to a Smart Calculator that sent
COMPUTING_REQUEST and all the required inputs. Provide the result of
the computing functions applied to the inputs provided by the Smart
Calculator.</p>

<p>Payload : {"MESSAGE_TYPE" : "COMPUTING_RESULT", "COMPUTING_RESULT" :
"the result of the computing function"}</p>

<h4>
<a name="user-content-43210-computing_failure" class="anchor" href="#43210-computing_failure"><span class="octicon octicon-link"></span></a>4.3.2.10 COMPUTING_FAILURE</h4>

<p>Sent by Compute Engine to a Smart Calculator that sent
COMPUTING_REQUEST and all the required inputs.</p>

<p>Inform the Smart Calculator that the computing of the inputs with the
requested computing function failed. The reasons are given in the
EXPLANATIONS field.</p>

<p>Payload : {"MESSAGE_TYPE" : "COMPUTING_RESULT", "EXPLANATIONS" :
"explanations of the reasons of the failure"}</p>

<h3>
<a name="user-content-44-security-considerations" class="anchor" href="#44-security-considerations"><span class="octicon octicon-link"></span></a>4.4. Security Considerations</h3>

<h4>
<a name="user-content-441-cryptographic-hash-function" class="anchor" href="#441-cryptographic-hash-function"><span class="octicon octicon-link"></span></a>4.4.1. Cryptographic hash function</h4>

<p>We have chosen to use the cryptographic hash function sha-256 to stock
and verify the passwords.</p>

<h4>
<a name="user-content-442-connexion-to-private-compute-engine" class="anchor" href="#442-connexion-to-private-compute-engine"><span class="octicon octicon-link"></span></a>4.4.2. Connexion to private compute engine</h4>

<p>There is no real "session" in this protocol, when the client tries to
connect to a private engine, we hash the password and then we compare to
the user_id/hash in our database. If the comparison is correct, the server
send the available functions. If the comparison
is wrong, the server send a LOGIN_FAILURE message and ask again for the user's
credentials.</p>

<h2>
<a name="user-content-5-examples" class="anchor" href="#5-examples"><span class="octicon octicon-link"></span></a>5. Examples</h2>

<p><a href="/schodaw/Smart-Calculator/blob/master/specification/img/sequeceDiagram.png" target="_blank"><img src="/schodaw/Smart-Calculator/raw/master/specification/img/sequeceDiagram.png" alt="" style="max-width:100%;"></a></p>

<h2>
<a name="user-content-6-references" class="anchor" href="#6-references"><span class="octicon octicon-link"></span></a>6. References</h2>

<ul>
<li>  "Distributed Computing Protocol V1.0 Specification : Dynamic
dicovery" by Simone Righitto and Anthony Roubaty</li>
</ul></article>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.05498s from github-fe117-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

