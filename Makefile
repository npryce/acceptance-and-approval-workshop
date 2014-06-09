
MD_SRC:=$(wildcard *.md)

.PHONY: all
all: out/handout.pdf
all: out/README.pdf

out/%.pdf: %.md
	@mkdir -p $(dir $@)
	pandoc --standalone -f markdown_github+simple_tables -o $@ $<

.PHONY: clean
clean:
	rm -rf out/

.PHONY: again
again: clean all

