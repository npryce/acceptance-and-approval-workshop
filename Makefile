
dataset=seasonally-adjusted-atmospheric-co2.csv

.PHONY: all
all: out/handout.md
all: out/python/approval.py
all: out/$(dataset)

out/%.md: %.md
	@mkdir -p $(dir $@)
	sed -e 's:{dataset}:$(dataset):g' $< > $@

out/$(dataset): datasets/$(dataset)

out/python/approval.py: sample-solutions/python/approval.py
	@mkdir -p $(dir $@)
	cp $< $@

.PHONY: clean
clean:
	rm -rf out/

.PHONY: again
again: clean all

