package com.vladsch.flexmark.html;

import com.vladsch.flexmark.util.options.DataHolder;

public class HtmlRendererOptions {
    public final String softBreak;
    public final String hardBreak;
    public final boolean escapeHtmlBlocks;
    public final boolean escapeHtmlCommentBlocks;
    public final boolean escapeInlineHtml;
    public final boolean escapeInlineHtmlComments;
    public final boolean percentEncodeUrls;
    public final int indentSize;
    public final boolean suppressHtmlBlocks;
    public final boolean suppressHtmlCommentBlocks;
    public final boolean suppressInlineHtml;
    public final boolean suppressInlineHtmlComments;
    public final boolean doNotRenderLinksInDocument;
    public final boolean renderHeaderId;
    public final boolean generateHeaderIds;
    public final String languageClassPrefix;
    public final String sourcePositionAttribute;
    public final boolean sourcePositionParagraphLines;
    public final boolean sourceWrapHtmlBlocks;
    public final int formatFlags;
    public final int maxTrailingBlankLines;
    //public final boolean sourceWrapInlineHtml;

    public HtmlRendererOptions(DataHolder options) {
        softBreak = HtmlRenderer.SOFT_BREAK.getFrom(options);
        hardBreak = HtmlRenderer.HARD_BREAK.getFrom(options);
        escapeHtmlBlocks = HtmlRenderer.ESCAPE_HTML_BLOCKS.getFrom(options);
        escapeHtmlCommentBlocks = HtmlRenderer.ESCAPE_HTML_COMMENT_BLOCKS.getFrom(options);
        escapeInlineHtml = HtmlRenderer.ESCAPE_INLINE_HTML.getFrom(options);
        escapeInlineHtmlComments = HtmlRenderer.ESCAPE_INLINE_HTML_COMMENTS.getFrom(options);
        percentEncodeUrls = HtmlRenderer.PERCENT_ENCODE_URLS.getFrom(options);
        indentSize = HtmlRenderer.INDENT_SIZE.getFrom(options);
        suppressHtmlBlocks = HtmlRenderer.SUPPRESS_HTML_BLOCKS.getFrom(options);
        suppressHtmlCommentBlocks = HtmlRenderer.SUPPRESS_HTML_COMMENT_BLOCKS.getFrom(options);
        suppressInlineHtml = HtmlRenderer.SUPPRESS_INLINE_HTML.getFrom(options);
        suppressInlineHtmlComments = HtmlRenderer.SUPPRESS_INLINE_HTML_COMMENTS.getFrom(options);
        doNotRenderLinksInDocument = HtmlRenderer.DO_NOT_RENDER_LINKS.getFrom(options);
        renderHeaderId = HtmlRenderer.RENDER_HEADER_ID.getFrom(options);
        generateHeaderIds = HtmlRenderer.GENERATE_HEADER_ID.getFrom(options);
        languageClassPrefix = HtmlRenderer.FENCED_CODE_LANGUAGE_CLASS_PREFIX.getFrom(options);
        sourcePositionAttribute = HtmlRenderer.SOURCE_POSITION_ATTRIBUTE.getFrom(options);
        sourcePositionParagraphLines = !sourcePositionAttribute.isEmpty() && HtmlRenderer.SOURCE_POSITION_PARAGRAPH_LINES.getFrom(options);
        sourceWrapHtmlBlocks = !sourcePositionAttribute.isEmpty() && HtmlRenderer.SOURCE_WRAP_HTML_BLOCKS.getFrom(options);
        //sourceWrapInlineHtml = !sourcePositionAttribute.isEmpty() && HtmlRenderer.SOURCE_WRAP_INLINE_HTML.getFrom(options);
        formatFlags = HtmlRenderer.FORMAT_FLAGS.getFrom(options);
        maxTrailingBlankLines = HtmlRenderer.MAX_TRAILING_BLANK_LINES.getFrom(options);
    }
}
