## 2026-10-26
- 起動時に「'url' attribute is not specified」→ application.properties に接続設定を書いていなかった → 教科書の4行を追加
- 「Using generated security password」が出た → Spring Security が入っていた → build.gradle から削除
- PlayerChara の tekkenid が小文字だった → tekkenId に統一（検索メソッド名に影響するため）